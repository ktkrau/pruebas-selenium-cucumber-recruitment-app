package pages;



public class PreguntasPage extends BasePage{

    private String agregarButton = "//button[contains(text(),'Agregar')]";
    private String preguntaField = "//input[@id='detalle']";
    private String crearButton = "//button[contains(text(),'Crear')]";
    private String addedQuestion = "//*[text()[contains(.,'Cuántos años de experiencia tienes?')]]";
    private String editarPreguntaButton = "//tbody/tr[1]/td[4]/button[1]";
    private String editarButton = "//button[contains(text(),'Editar')]";
    private String addedEditedQuestion = "//*[text()[contains(.,'Qué día es hoy?')]]";
    private String deleteButton = "//tbody/tr[1]/td[5]/button[1]";
    //private String firstResult = "div.container.my-3:nth-child(2) div.card div.card-body table.table.table-hover.table-striped tbody:nth-child(2) tr:nth-child(1) > td:nth-child(2)";
    private String mainTable= "//td[*]";
    


    public PreguntasPage(){
        super(driver);
    }
    public void navigatetoPreguntas(){
        navigateTo("http://localhost:4200/preguntas");
    }

    public void clickAgregar(){
        clickElement(agregarButton);
    }

    public void enterPregunta(String criteria){
        write(preguntaField, criteria);
    }

    public void clickCrear(){
        clickElement(crearButton);
    }
    
    public String addedToTable(){
        return textFromElement(addedQuestion);
    }

    //-------------------botón editar-----------------
    public void clickEditarPregunta(){
        clickElement(editarPreguntaButton);
    }
    public void clickEditarButton(){
        clickElement(editarButton);
    }
    public String addedToTableAgain(){
        return textFromElement(addedEditedQuestion);
    }
    public void clickDeleteButton(){
        clickElement(deleteButton);
    }
    /* public String deletedQuestion(){
        return textFromElement(firstResult);
    } */
    public boolean isDelete(){
        return elementIsDisplayed(mainTable);
    }

}
