package org.kyojo.schemaorg.m3n5.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.bib.impl.PENCILER;
import org.kyojo.schemaorg.m3n5.bib.Container.Penciler;

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
