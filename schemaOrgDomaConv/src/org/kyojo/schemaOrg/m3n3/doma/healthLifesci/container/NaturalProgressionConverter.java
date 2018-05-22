package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.NATURAL_PROGRESSION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.NaturalProgression;

@ExternalDomain
public class NaturalProgressionConverter implements DomainConverter<NaturalProgression, String> {

	@Override
	public String fromDomainToValue(NaturalProgression domain) {
		return domain.getNativeValue();
	}

	@Override
	public NaturalProgression fromValueToDomain(String value) {
		return new NATURAL_PROGRESSION(value);
	}

}
