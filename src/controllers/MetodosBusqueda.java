package controllers;
import models.Person;
import views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole ShowConsole;
    private Person[] people;

    public MetodosBusqueda(Person[] persons){
        ShowConsole=new ShowConsole();
        this.people=persons;
            showPerson();
            showPersonN();
    }

    public int busquedaLineal(int[] arreglo,int valor){
        for(int i=0;i<arreglo.length;i++){
            if( arreglo[i]==valor){
                return i;
            }
        }
        return -1;
    }

    public int findPersonByCode(int code){
        for (int i=0;i<people.length;i++){
            if(people[i].getCode()==code){
                return i;
            }
            
        }
        return -1;
    }

    public int findPersonByName(String name){
        for (int i=0;i<people.length;i++){
            if(people[i].getName()==name){
                return i;
            }
            
        }
        return -1;
    }
   public void showPerson(){
        int codeToFind=ShowConsole.inputCode();
        int indexPerson= findPersonByCode(codeToFind);
        if (indexPerson>=0){
            ShowConsole.showMessagge("Persona con codigo: "+codeToFind+" encontrada");
            ShowConsole.showMessagge("La persona es: "+people[indexPerson].toString()+" ");
        } else{
            ShowConsole.showMessagge("Persona no encontrada");
        }
    }

    public void showPersonN(){
        int nameToFind=ShowConsole.inputName();
        int indexPerson= findPersonByCode(nameToFind);
        if (indexPerson>=0){
            ShowConsole.showMessagge("Persona con codigo: "+nameToFind+" encontrada");
            ShowConsole.showMessagge("La persona es: "+people[indexPerson]+" ");
        } else{
            ShowConsole.showMessagge("Persona no encontrada");
        }
    }
}
