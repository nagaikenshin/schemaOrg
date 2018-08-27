package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.INTENSITY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Intensity;

@ExternalDomain
public class IntensityConverter implements DomainConverter<Intensity, String> {

	@Override
	public String fromDomainToValue(Intensity domain) {
		return domain.getNativeValue();
	}

	@Override
	public Intensity fromValueToDomain(String value) {
		return new INTENSITY(value);
	}

}
