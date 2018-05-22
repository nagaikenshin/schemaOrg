package org.kyojo.schemaOrg.m3n3.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.ABRIDGED;
import org.kyojo.schemaOrg.m3n3.bib.Container.Abridged;

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
