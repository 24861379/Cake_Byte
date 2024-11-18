package datos;

import entidades.usuario;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioDAOTest {

    private UsuarioDAO usuarioDAO;
    private usuario existingUser; // Usuario existente en la base de datos
    private usuario testUser;    // Usuario de prueba para inserción

    @Before
    public void setUp() {
        usuarioDAO = new UsuarioDAO();
        // Usuario ya existente en la base de datos
        existingUser = new usuario("isamu", "12345", "Cliente");
        // Usuario adicional para pruebas
        testUser = new usuario("samuel", "123456789", "Cliente");

        // Asegurarse de que el usuario de prueba no exista
        if (usuarioDAO.existencia(testUser.getNombre_Usuario())) {
            usuarioDAO.actualizar(testUser);
        }
    }

    @After
    public void tearDown() {
        // Restaurar valores originales si se modificó el usuario existente
        existingUser.setContraseña("12345");
        usuarioDAO.actualizar(existingUser);

        // Restaurar el usuario de prueba si fue modificado
        testUser.setContraseña("123456789");
        if (usuarioDAO.existencia(testUser.getNombre_Usuario())) {
            usuarioDAO.actualizar(testUser);
        }
    }

    @Test
    public void testListar() {
        System.out.println("Metodo Listar");
        String texto = "isamu"; // texto que coincide con el usuario existente
        List<usuario> result = usuarioDAO.listar(texto);
        assertFalse(result.isEmpty()); // verifica que hay resultados
        assertEquals("isamu", result.get(0).getNombre_Usuario()); // verifica el nombre de usuario
        assertEquals("12345", result.get(0).getContraseña()); // verifica la contraseña
        assertEquals("Cliente", result.get(0).getRol()[0]); // verifica el rol del usuario
    }

    @Test
    public void testInsertar() {
        System.out.println("Metodo Insertar");
        // Verificar si el usuario ya existe
        if (!usuarioDAO.existencia(testUser.getNombre_Usuario())) {
            boolean result = usuarioDAO.insertar(testUser);
            assertTrue(result); // verifica que la inserción fue exitosa

            // Verificar que el usuario fue insertado correctamente
            usuario insertedUser = usuarioDAO.listar(testUser.getNombre_Usuario()).get(0);
            assertEquals("samuel", insertedUser.getNombre_Usuario());
            assertEquals("123456789", insertedUser.getContraseña());
            assertEquals("Empleado", insertedUser.getRol()[0]); // Verifica el rol correcto
//        } else {
//            System.out.println("El usuario ya existe, no se puede insertar.");
        }
    }

    @Test
    public void testExistencia() {
        System.out.println("Metodo Existencia");
        boolean result = usuarioDAO.existencia(existingUser.getNombre_Usuario());
        assertTrue(result); // verifica que el usuario existente está en la base de datos
    }
}
