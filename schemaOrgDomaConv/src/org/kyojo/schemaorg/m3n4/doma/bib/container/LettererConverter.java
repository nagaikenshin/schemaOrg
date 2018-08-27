package org.kyojo.schemaorg.m3n4.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.bib.impl.LETTERER;
import org.kyojo.schemaorg.m3n4.bib.Container.Letterer;

@ExternalDomain
public class LettererConverter implements DomainConverter<Letterer, String> {

	@Override
	public String fromDomainToValue(Letterer domain) {
		return domain.getNativeValue();
	}

	@Override
	public Letterer fromValueToDomain(String value) {
		return new LETTERER(value);
	}

}
