package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ILLUSTRATOR;
import org.kyojo.schemaorg.m3n5.core.Container.Illustrator;

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
