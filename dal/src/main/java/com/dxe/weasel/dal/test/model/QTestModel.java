package com.dxe.weasel.dal.test.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTestModel is a Querydsl query type for TestModel
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTestModel extends EntityPathBase<TestModel> {

    private static final long serialVersionUID = 1919549202L;

    public static final QTestModel testModel = new QTestModel("testModel");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath test1 = createString("test1");

    public QTestModel(String variable) {
        super(TestModel.class, forVariable(variable));
    }

    public QTestModel(Path<? extends TestModel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTestModel(PathMetadata<?> metadata) {
        super(TestModel.class, metadata);
    }

}

