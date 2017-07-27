using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Paradigma
{
    class Auto
    {
        private static int velocidad;

        public static void acelerar(int v)
        {
            velocidad = velocidad + v;
        }

        public static void frenar(int v)
        {
            velocidad = velocidad - v;
        }

        public static void imprimir()
        {
            Console.WriteLine(velocidad);
        }
    }

    class x
    {
        public static void print(string x)
        {
            Console.WriteLine(x);
        }

        public static void print(double x)
        {
            Console.WriteLine(x);
        }

        public static void cartel(string x)
        {
            print("------------------------");
            print(x);
            print("------------------------");
            print("");
        }

        public static void pausa()
        {
            print("Presione una tecla para continuar.");
            Console.ReadKey();
        }

    }

    abstract class Persona
    {
        protected string nombre;
        protected string apellido;

        //public Persona(string n, string a)
        //{
        //    this.nombre = n;
        //    this.apellido = a;
        //}

        public void imprimir()
        {
            Console.WriteLine(nombre+" "+apellido);
        }
    }

    class Empleado : Persona
    {
        private int legajo;

        public Empleado(int l, string n, string a)
        {
            this.legajo = l;
            this.nombre = n;
            this.apellido = a;
        }

    }

    class Program
    {
        static void Main(string[] args)
        {
            // descargar Visual Studio Express
            // Utilizamos el lenguaje Visual C#

            Console.WriteLine("Hola Mundo");

            Console.WriteLine("--- Auto 1 ---");
            Auto a1 = new Auto();
            Auto.acelerar(10);
            Auto.imprimir();

            Console.WriteLine("--- Auto 2 ---");
            Auto a2 = new Auto();
            Auto.acelerar(20);
            Auto.imprimir();


            Auto.imprimir();


            Console.WriteLine("--- Auto 3 ---");
            Auto a3 = new Auto();
            Auto.imprimir();


            Auto.acelerar(20);
            Auto.imprimir();

            x.print("Hola");
            x.print("Viernes");

            x.print(24);


            x.cartel("Bienvenido a la clase x");
            x.pausa();
            x.print("ultima clase del curso");
            x.pausa();

            //Persona p1 = new Persona("Juan","Perez");
            //p1.imprimir();

            Empleado e1 = new Empleado(1,"Juan","Perez");
            e1.imprimir();

            x.pausa();


        }
    }
}
