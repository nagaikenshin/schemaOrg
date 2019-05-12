package org.kyojo.schemaorg.m3n5.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.physicalExam.APPEARANCE;
import org.kyojo.schemaorg.m3n5.healthLifesci.PhysicalExam.Appearance;

@ExternalDomain
public class AppearanceConverter implements DomainConverter<Appearance, String> {

	@Override
	public String fromDomainToValue(Appearance domain) {
		return domain.getNativeValue();
	}

	@Override
	public Appearance fromValueToDomain(String value) {
		return new APPEARANCE(value);
	}

}
