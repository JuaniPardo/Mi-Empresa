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

        //ASIGNO DATOS
        direcciones[0].calle = "Mitre";
        direcciones[0].num = 125;
        direcciones[0].provincia = "CABA";

        direcciones[1].calle = "Rawson";
        direcciones[1].num = 234;
        direcciones[1].provincia = "Bs As";

        direcciones[2].calle = "Cabildo";
        direcciones[2].num = 381;
        direcciones[2].provincia = "CABA";

        direcciones[3].calle = "Peña";
        direcciones[3].num = 477;
        direcciones[3].provincia = "Chaco";

        direcciones[4].calle = "San Martin";
        direcciones[4].num = 410;
        direcciones[4].provincia = "Jujuy";

        direcciones[5].calle = "Güemes";
        direcciones[5].num = 673;
        direcciones[5].provincia = "CABA";

        clientes[0].id = 101;
        clientes[0].nombre = "Jorge Lin";
        clientes[0].contacto = "jorgelin@gmail.com";
        clientes[0].estado = 'A';
        clientes[0].direccion = direcciones[0];

        clientes[1].id = 102;
        clientes[1].nombre = "Pablo Gomiz";
        clientes[1].contacto = "pablogomiz@gmail.com";
        clientes[1].estado = 'A';
        clientes[1].direccion = direcciones[1];


        clientes[2].id = 103;
        clientes[2].nombre = "Alan Parker";
        clientes[2].contacto = "alanparker@gmail.com";
        clientes[2].estado = 'A';
        clientes[2].direccion = direcciones[2];


        empleados[0].nombreEmpleado = "Juan";
        empleados[0].apellidoEmpleado = "Perez";
        empleados[0].id = 1;
        empleados[0].salario = 50000;
        empleados[0].d1 = direcciones[3];

        empleados[1].nombreEmpleado = "Luis";
        empleados[1].apellidoEmpleado = "Gomez";
        empleados[1].id = 2;
        empleados[1].salario = 60000;
        empleados[1].d1 = direcciones[4];


        empleados[2].nombreEmpleado = "Paco";
        empleados[2].apellidoEmpleado = "Garcia";
        empleados[2].id = 3;
        empleados[2].salario = 70000;
        empleados[2].d1 = direcciones[5];

        //USO 2 CICLOS PARA IMPRIMIR DATOS POR SEPARADO
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
