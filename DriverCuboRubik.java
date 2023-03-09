package Clases;

public class DriverCuboRubik {
    public static void main(String[] args){
        //contructores
        cuboRubik cr = new cuboRubik();
        cuboRubik cr1 = new cuboRubik("Rubik", 6, "Clasico");
        System.out.println(cr1);

        //metodo de acceso
        cuboRubik cr2 = new cuboRubik();
        cr2.setMarca("Yuxin");
        cr2.setCantCuadros(4);
        cr2.setDiseño("Mapa");
        System.out.println("Marca: " + cr2.getMarca());
        System.out.println("Cantidad de cuadros por cara: " + cr2.getCantCuadros());
        System.out.println("Diseño: " + cr2.getDiseño());

        //metodo tostring
        System.out.println(cr1.toString());


        //metodo de uso general

    }
}
