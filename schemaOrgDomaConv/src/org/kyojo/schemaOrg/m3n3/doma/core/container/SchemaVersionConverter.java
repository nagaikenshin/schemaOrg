package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SCHEMA_VERSION;
import org.kyojo.schemaOrg.m3n3.core.Container.SchemaVersion;

@ExternalDomain
public class SchemaVersionConverter implements DomainConverter<SchemaVersion, String> {

	@Override
	public String fromDomainToValue(SchemaVersion domain) {
		return domain.getNativeValue();
	}

	@Override
	public SchemaVersion fromValueToDomain(String value) {
		return new SCHEMA_VERSION(value);
	}

}
