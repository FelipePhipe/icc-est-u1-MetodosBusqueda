package controllers;
import models.Person;
import views.ShowConsole;

public class MetodoBusquedaBinaria {

    private Person[] personas;
    private ShowConsole show;

    public MetodoBusquedaBinaria(Person[] personas){
        this.personas=personas;
        this.show=new ShowConsole();
        show.showMessagge("----Metodo de busqueda binaria----");
        
    }
    private int findPersonByCode(int code){
        int bajo=0;
        int alto=personas.length-1;

        while (alto>=bajo){
            int central= (alto+bajo)/2;

            if (personas[central].getCode()==code){
                return central;

            }
            if (personas[central].getCode()>code){
                alto=central-1; //se va a la izquierda al ser mayor al numero que busco(esta ordenado de ma a me)

            }else{
                bajo=central+1; //se va a la derecha 

            }
        }
        return -1;
    }
    public void showPersonByCode(){
        int codeToFinde= show.inputCode();
        int indexPerson=findPersonByCode(codeToFinde);
        if (indexPerson==-1){
            show.showMessagge("Persona con codigo: "+codeToFinde+" no encontrada");
        }else{
            show.showMessagge("Persona con codigo: "+ codeToFinde+" encontrada");
            show.showMessagge(personas[indexPerson].toString());
        }
    }
    

    public void ordenarBurbujaLista(){
        for (int i=0; i<personas.length;i++){
            for (int j=i+1;j<personas.length;j++){
                if (personas[i].getName().compareToIgnoreCase(personas[j].getName())>0){
                    Person aux= personas[i];
                    personas[i]=personas[j];
                    personas[j]=aux;
                }

            }
        }
    }

    private int findPersonByName(String name){
        int bajo=0;
        int alto=personas.length-1;

        while (alto>=bajo){
            int central= (alto+bajo)/2;

            if (personas[0].getName().equalsIgnoreCase(name)){
                return central;

            }
            if (personas[0].getName().compareToIgnoreCase(name)>0){
                alto=central-1; 

            }else{
                bajo=central+1; 

            }
        }
        return -1;
    }
    public void showPersonByName(){
        String nameToFind= show.inputName2();
        int indexPerson=findPersonByName(nameToFind);
        if (indexPerson==-1){
            show.showMessagge("Persona con codigo: "+nameToFind+" no encontrada");
        }else{
            show.showMessagge("Persona con codigo: "+ nameToFind+" encontrada");
            show.showMessagge(personas[indexPerson].toString());
        }
    }
    
}
