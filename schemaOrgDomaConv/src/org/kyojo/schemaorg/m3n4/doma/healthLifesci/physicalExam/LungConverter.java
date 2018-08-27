package org.kyojo.schemaorg.m3n4.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.physicalExam.LUNG;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalExam.Lung;

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
