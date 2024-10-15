package com.messaging.models.template;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MessageTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int templateId;
    private String templateName;
    private String templateDescription1;
    private String templateDescription2;
    private String status;
    private String templateType;
    private String template;
}
