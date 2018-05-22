package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.physicalExam.APPEARANCE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.PhysicalExam.Appearance;

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
