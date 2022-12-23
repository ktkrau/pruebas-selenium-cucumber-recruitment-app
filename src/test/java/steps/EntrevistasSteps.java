package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EntrevistasPage;

public class EntrevistasSteps {
    EntrevistasPage entrevistas = new EntrevistasPage();

    @Given("^the user navigates to entrevistas page$")
    public void navigatesToEntrevistas(){
        entrevistas.navigateToEntrevistas();
    }
    @And("^click on crear entrevista button$")
    public void clickEntrevista(){
        entrevistas.clickCrearEntrevistaButton();
        
    }
    @When("^the user enter a interview$")
    public void enterInterview(){
        entrevistas.enterPerfilBuscado("Full Stack Developer");
        entrevistas.enterComentariosPrueba("No respondió pregunta 2");
        entrevistas.enterComentariosGenerales("Postulante llegó tarde");
        entrevistas.enterRecomendaciones(" - ");
        entrevistas.enterDescripcionPersonal("Buenas habilidades blandas");
        entrevistas.enterPreguntasCandidatos(" - ");
        
    }
    @And("^And click on crear button$")
    public void clickCrear(){
        entrevistas.clickCrearEntrevistaButton();
        entrevistas.acceptAlert();
    }
    @Then("^the user is able to add the interview to the list$")
    public void validateResult(){
        Assert.assertEquals("Full Stack Developer", entrevistas.addedToTable());
    }

    //--------------------------------editar -----------------------------

    @When("^click on editar entrevista button$")
    public void clickeditInterview(){
        entrevistas.clickEditarEntrevista();
    }


    @And("^the user edit a interview$")
    public void editInterview(){
        
    }

    @And("^click on editar button again$")
    public void clickEditarButton(){
        
        

    }

    @Then("^the user is able to add the edited interview to the list$")
    public void validateEditInterviewResult(){
       
    }
}
