package empresaTest;

import empresa.Cliente;
import empresa.Direccion;
import empresa.Empleado;

public class Test {
    public static void main(String[] args) {
        /*
        Empleado e1= new Empleado();
        Cliente c1= new Cliente();
        Direccion d1= new Direccion();
        Direccion d2= new Direccion();
         */

        //CREO LOS ARRAYS DE OBJETOS
        Empleado[] empleados = new Empleado[3];
        Cliente[] clientes = new Cliente[3];
        Direccion[] direcciones = new Direccion[6];

        // USO UN CICLO PARA CREAR LOS OBJETOS DENTRO DE LOS ARRAYS
        for (int i = 0; i < 6; i++) {
            direcciones[i] = new Direccion();

            if (i<3){
                empleados[i] = new Empleado();
                clientes[i] = new Cliente();
            }
        }
        //ASIGNO DATOS#######################
        direcciones[0].setCalle("Mitre");
        direcciones[0].setNum(125);
        direcciones[0].setProvincia("CABA");

        direcciones[1].setCalle("Rawson");
        direcciones[1].setNum(234);
        direcciones[1].setProvincia("Bs As");

        direcciones[2].setCalle("Cabildo");
        direcciones[2].setNum(381);
        direcciones[2].setProvincia("CABA");

        direcciones[3].setCalle("Peña");
        direcciones[3].setNum(477);
        direcciones[3].setProvincia("Chaco");

        direcciones[4].setCalle("San Martin");
        direcciones[4].setNum(410);
        direcciones[4].setProvincia("Jujuy");

        direcciones[5].setCalle("Güemes");
        direcciones[5].setNum(673);
        direcciones[5].setProvincia("CABA");

        clientes[0].setId(101);
        clientes[0].setNombre("Jorge Lin");
        clientes[0].setContacto("jorgelin@gmail.com");
        clientes[0].setEstado('A');
        clientes[0].setDireccion(direcciones[0]);

        clientes[1].setId(102);
        clientes[1].setNombre("Pablo Gomiz");
        clientes[1].setContacto("pablogomiz@gmail.com");
        clientes[1].setEstado('A');
        clientes[1].setDireccion(direcciones[1]);

        clientes[2].setId(103);
        clientes[2].setNombre("Alan Parker");
        clientes[2].setContacto("alanparker@gmail.com");
        clientes[2].setEstado('A');
        clientes[2].setDireccion(direcciones[2]);

        empleados[0].setNombreEmpleado("Juan");
        empleados[0].setApellidoEmpleado("Perez");
        empleados[0].setId(1);
        empleados[0].setSalario(50000);
        empleados[0].setD1(direcciones[3]);

        empleados[1].setNombreEmpleado("Luis");
        empleados[1].setApellidoEmpleado("Gomez");
        empleados[1].setId(2);
        empleados[1].setSalario(60000);
        empleados[1].setD1(direcciones[4]);

        empleados[2].setNombreEmpleado("Paco");
        empleados[2].setApellidoEmpleado("Garcia");
        empleados[2].setId(3);
        empleados[2].setSalario(70000);
        empleados[2].setD1(direcciones[5]);

        //USO 2 CICLOS PARA IMPRIMIR DATOS POR SEPARADO############
        for (int i = 0; i < 3; i++) {
            System.out.println("Empleado " + (i+1));
            empleados[i].mostrarInfo();
            System.out.println("\n-----------------\n");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Cliente " + (i+1));
            clientes[i].mostrarInfoCliente();
            System.out.println("\n-----------------\n");
        }

    }
}
