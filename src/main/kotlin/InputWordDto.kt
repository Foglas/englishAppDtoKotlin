import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotBlank

data class InputWordDto(

    @field:NotBlank(message = "Word have to be with text form")
    val text: String?,
    val secondForm: String?,
    val thirdForm: String?,
    val countable: String?,
    val examples : List<ExampleDto> = emptyList(),
){

    class Builder(
        var text: String?=null,
        var secondForm: String?=null,
        var thirdForm: String?=null,
        var countable: String?=null,
        var examples : List<ExampleDto> = emptyList(),
    ){
        fun text(text: String) = apply { this.text = text }
        fun secondaryForm(secondForm: String) = apply { this.secondForm = secondForm }
        fun thirdForm(thirdForm: String) = apply { this.thirdForm = thirdForm }
        fun countable(countable: String) = apply { this.countable = countable }
        fun examples(examples: List<ExampleDto>) = apply { this.examples = examples}
        fun build() = InputWordDto(text,secondForm,thirdForm,countable,examples)

    }
}

