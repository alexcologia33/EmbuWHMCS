package br.com.ope.config

import org.hibernate.dialect.H2Dialect
import java.sql.Types

class H2DialectCustom : H2Dialect() {
    init {
        registerColumnType(Types.OTHER, "varchar(255)")
    }

}