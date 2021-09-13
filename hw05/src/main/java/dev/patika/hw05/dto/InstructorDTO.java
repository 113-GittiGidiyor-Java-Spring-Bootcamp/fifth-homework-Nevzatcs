package dev.patika.hw05.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstructorDTO {
    @ApiModelProperty(hidden = true)
    private int id;

    @ApiModelProperty(example = "Koray Can")
    @NotBlank(message = "Name is mandatory")
    private String name;

    @ApiModelProperty(example = "5")
    @NotBlank(message = "Address is mandatory")
    private String address;

    @ApiModelProperty(example = "5")
    @NotNull(message = "Phone number is mandatory")
    private String phoneNumber;

}
