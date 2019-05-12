package org.kyojo.schemaorg.m3n5.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.physicalExam.SKIN;
import org.kyojo.schemaorg.m3n5.healthLifesci.PhysicalExam.Skin;

@ExternalDomain
public class SkinConverter implements DomainConverter<Skin, String> {

	@Override
	public String fromDomainToValue(Skin domain) {
		return domain.getNativeValue();
	}

	@Override
	public Skin fromValueToDomain(String value) {
		return new SKIN(value);
	}

}
