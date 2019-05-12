package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DEPENDENCIES;
import org.kyojo.schemaorg.m3n5.core.Container.Dependencies;

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
