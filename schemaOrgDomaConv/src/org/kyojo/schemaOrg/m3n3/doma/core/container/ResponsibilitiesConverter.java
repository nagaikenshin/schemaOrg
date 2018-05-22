package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESPONSIBILITIES;
import org.kyojo.schemaOrg.m3n3.core.Container.Responsibilities;

@ExternalDomain
public class ResponsibilitiesConverter implements DomainConverter<Responsibilities, String> {

	@Override
	public String fromDomainToValue(Responsibilities domain) {
		return domain.getNativeValue();
	}

	@Override
	public Responsibilities fromValueToDomain(String value) {
		return new RESPONSIBILITIES(value);
	}

}
