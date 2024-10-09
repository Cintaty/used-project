import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();

        // Crear un nuevo empleado
        Empleado nuevoEmpleado = new Empleado();
        nuevoEmpleado.setNombre("María Pérez");
        nuevoEmpleado.setPuesto("Analista");
        nuevoEmpleado.setSalario(new BigDecimal("50000.00"));
        empleadoDAO.agregarEmpleado(nuevoEmpleado);

        // Leer todos los empleados
        List<Empleado> empleados = empleadoDAO.obtenerEmpleados();
        for (Empleado emp : empleados) {
            System.out.println(emp.getId() + ": " + emp.getNombre() + ", " + emp.getPuesto() + ", " + emp.getSalario());
        }

        // Actualizar empleado
        nuevoEmpleado.setSalario(new BigDecimal("52000.00"));
        empleadoDAO.actualizarEmpleado(nuevoEmpleado);

        // Eliminar empleado
        empleadoDAO.eliminarEmpleado(nuevoEmpleado.getId());
    }
}