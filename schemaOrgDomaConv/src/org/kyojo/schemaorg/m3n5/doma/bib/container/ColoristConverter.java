package org.kyojo.schemaorg.m3n5.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.bib.impl.COLORIST;
import org.kyojo.schemaorg.m3n5.bib.Container.Colorist;

@ExternalDomain
public class ColoristConverter implements DomainConverter<Colorist, String> {

	@Override
	public String fromDomainToValue(Colorist domain) {
		return domain.getNativeValue();
	}

	@Override
	public Colorist fromValueToDomain(String value) {
		return new COLORIST(value);
	}

}
