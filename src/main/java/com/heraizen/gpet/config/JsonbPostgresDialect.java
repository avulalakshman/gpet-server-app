package com.heraizen.gpet.config;

import java.sql.Types;

import org.hibernate.dialect.PostgreSQL10Dialect;

public class JsonbPostgresDialect extends PostgreSQL10Dialect {
    public JsonbPostgresDialect() {
        this.registerColumnType(Types.JAVA_OBJECT,"jsonb");
    }

}
