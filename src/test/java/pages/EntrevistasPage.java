package pages;

public class EntrevistasPage extends BasePage {
    
    private String crearEntrevistaButton = "//button[contains(text(),'crear')]";
    private String perfilBuscadoField = "//input[@id='perfilBuscado']";
    private String comentariosPruebaField = "//input[@id='comentariosPrueba']";
    private String comentariosGeneralesField = "//input[@id='comentariosGenerales']";
    private String recomendacionesField = "//input[@id='recomendaciones']";
    private String descripcionPersonalField = "//input[@id='descripcionPersonal']";
    private String preguntasCandidatosField = "//input[@id='preguntasCandidato']";
    private String addedInterview = "//*[text()[contains(.,'Full Stack Developer')]]";
    private String editarEntrevistaButton = "//button[contains(text(),'editar')]";


    public EntrevistasPage(){
        super(driver);
    }
    public void navigateToEntrevistas(){
        navigateTo("http://localhost:4200/entrevistas");
    }
    public void clickCrearEntrevistaButton(){
        clickElement(crearEntrevistaButton);
    }
    public void enterPerfilBuscado(String criteria){
        write(perfilBuscadoField, criteria);
    }
    public void enterComentariosPrueba(String criteria){
        write(comentariosPruebaField, criteria);
    }
    public void enterComentariosGenerales(String criteria){
        write(comentariosGeneralesField, criteria);
    }
    public void enterRecomendaciones(String criteria){
        write(recomendacionesField, criteria);
    }
    public void enterDescripcionPersonal(String criteria){
        write(descripcionPersonalField, criteria);
    }
    public void enterPreguntasCandidatos(String criteria){
        write(preguntasCandidatosField, criteria);
    }

    public String addedToTable(){
        return textFromElement(addedInterview);
    }
    //--------------botón editar--------------
    public void clickEditarEntrevista(){
        clickElement(editarEntrevistaButton);
    }


}

