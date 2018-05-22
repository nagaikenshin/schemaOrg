package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ILLUSTRATOR;
import org.kyojo.schemaOrg.m3n3.core.Container.Illustrator;

@ExternalDomain
public class IllustratorConverter implements DomainConverter<Illustrator, String> {

	@Override
	public String fromDomainToValue(Illustrator domain) {
		return domain.getNativeValue();
	}

	@Override
	public Illustrator fromValueToDomain(String value) {
		return new ILLUSTRATOR(value);
	}

}
