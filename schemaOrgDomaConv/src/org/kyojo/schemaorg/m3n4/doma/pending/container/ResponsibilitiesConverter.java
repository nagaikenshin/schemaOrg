package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.RESPONSIBILITIES;
import org.kyojo.schemaorg.m3n4.pending.Container.Responsibilities;

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