public class MetodosBusqueda {
    public int busquedaLineal (int arreglo[],int valorDes){
        for (int i=0;i<arreglo.length;i++){
            if (arreglo[i]==valorDes){
                return i;
            }
        }
        return -1;
    }
    
}
