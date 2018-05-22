package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.physicalExam.LUNG;
import org.kyojo.schemaOrg.m3n3.healthLifesci.PhysicalExam.Lung;

@ExternalDomain
public class LungConverter implements DomainConverter<Lung, String> {

	@Override
	public String fromDomainToValue(Lung domain) {
		return domain.getNativeValue();
	}

	@Override
	public Lung fromValueToDomain(String value) {
		return new LUNG(value);
	}

}
