package com.messaging.repository;

import com.messaging.models.template.MessageTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplateRepository extends JpaRepository<MessageTemplate,Integer> {

    @Query("select t from MessageTemplate t where t.templateName=?1")
    List<MessageTemplate> findTemplateDataByTemplateName(String name);
}
