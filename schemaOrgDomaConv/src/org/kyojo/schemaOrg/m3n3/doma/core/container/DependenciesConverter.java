package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEPENDENCIES;
import org.kyojo.schemaOrg.m3n3.core.Container.Dependencies;

@ExternalDomain
public class DependenciesConverter implements DomainConverter<Dependencies, String> {

	@Override
	public String fromDomainToValue(Dependencies domain) {
		return domain.getNativeValue();
	}

	@Override
	public Dependencies fromValueToDomain(String value) {
		return new DEPENDENCIES(value);
	}

}
