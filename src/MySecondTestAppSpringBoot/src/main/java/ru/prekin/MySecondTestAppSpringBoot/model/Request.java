package ru.prekin.MySecondTestAppSpringBoot.model;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Request {
    @NotBlank(message = "UID is required")
    @Size(max = 32, message = "UID must be up to 32 characters")
    private String uid;
    @NotBlank(message = "Operation UID is required")
    @Size(max = 32, message = "Operation UID must be up to 32 characters")
    private String operationUid;
    private String systemName;
    @NotBlank(message = "System time is required")
    private String systemTime;
    private String source;
    @Min(value = 1, message = "Communication ID must be at least 1")
    @Max(value = 100000, message = "Communication ID must be at most 100000")
    private int communicationId;
    private int templateId;
    private int productCode;
    private int smsCode;
}

