package com.dxe.squirrel.test;

import com.mysema.query.codegen.GenericExporter;
import com.mysema.query.codegen.Keywords;

import javax.persistence.*;
import java.io.File;

public class GenQueryDsl {
    public static void main(String[] args) {
        GenericExporter exporter = new GenericExporter();
        exporter.setKeywords(Keywords.JPA);
        exporter.setEntityAnnotation(Entity.class);
        exporter.setEmbeddableAnnotation(Embeddable.class);
        exporter.setEmbeddedAnnotation(Embedded.class);
        exporter.setSupertypeAnnotation(MappedSuperclass.class);
        exporter.setSkipAnnotation(Transient.class);
        exporter.setTargetFolder(new File("E:/test"));
        exporter.export("com.dxe.squirrel.dal.test.model");
    }
}
