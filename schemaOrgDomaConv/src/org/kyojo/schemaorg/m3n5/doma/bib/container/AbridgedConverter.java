package org.kyojo.schemaorg.m3n5.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.bib.impl.ABRIDGED;
import org.kyojo.schemaorg.m3n5.bib.Container.Abridged;

@ExternalDomain
public class AbridgedConverter implements DomainConverter<Abridged, Boolean> {

	@Override
	public Boolean fromDomainToValue(Abridged domain) {
		return domain.getNativeValue();
	}

	@Override
	public Abridged fromValueToDomain(Boolean value) {
		return new ABRIDGED(value);
	}

}
