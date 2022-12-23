package steps;




import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PreguntasPage;

public class PreguntasSteps {

    PreguntasPage preguntas = new PreguntasPage();
    
    
    @Given("^the user navigates to preguntas page$")
    public void navigatetoPreguntas(){
        preguntas.navigatetoPreguntas();
    }
    @And("^click on añadir pregunta button$")
    public void clickaddPregunta(){
        preguntas.clickAgregar();
    }


    @When("^the user enter a question$")
    public void writePregunta(){
        preguntas.enterPregunta("Cuántos años de experiencia tienes?");
    }

    @And("^click on crear button$")
    public void clickCrear(){
        preguntas.clickCrear();
        preguntas.acceptAlert();

    }

    @Then("^the user is able to add the question to the list$")
    public void validateResult(){
        Assert.assertEquals("Cuántos años de experiencia tienes?", preguntas.addedToTable());
    }
    //--------------------------------------------- editar preguntas --------------------------------------------------
    
    @When("^click on editar pregunta button$")
    public void clickeditPregunta(){
        preguntas.clickEditarPregunta();
    }


    @And("^the user edit a question$")
    public void editPregunta(){
        preguntas.enterPregunta("Qué día es hoy?");
    }

    @And("^click on editar button$")
    public void clickEditar(){
        preguntas.clickEditarButton();
        preguntas.acceptAlert();
        

    }

    @Then("^the user is able to add the edited question to the list$")
    public void validateEditResult(){
        Assert.assertEquals("Qué día es hoy?", preguntas.addedToTableAgain());
    }
    //------------------------------------ eliminar preguntas ----------------------------------
    @When("^click on eliminar pregunta button$")
    public void clickdeletePregunta(){
        preguntas.clickDeleteButton();
        preguntas.acceptAlert();

    }
    @Then("^the question is not on the table$")
    public void validateDeleteResult(){
        preguntas.navigatetoPreguntas();
    }
}