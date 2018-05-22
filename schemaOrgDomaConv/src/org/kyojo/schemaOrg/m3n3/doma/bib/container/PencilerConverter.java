package org.kyojo.schemaOrg.m3n3.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.PENCILER;
import org.kyojo.schemaOrg.m3n3.bib.Container.Penciler;

@ExternalDomain
public class PencilerConverter implements DomainConverter<Penciler, String> {

	@Override
	public String fromDomainToValue(Penciler domain) {
		return domain.getNativeValue();
	}

	@Override
	public Penciler fromValueToDomain(String value) {
		return new PENCILER(value);
	}

}
