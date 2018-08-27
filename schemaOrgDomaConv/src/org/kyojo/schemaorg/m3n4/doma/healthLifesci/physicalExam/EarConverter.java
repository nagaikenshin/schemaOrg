package org.kyojo.schemaorg.m3n4.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.physicalExam.EAR;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalExam.Ear;

@ExternalDomain
public class EarConverter implements DomainConverter<Ear, String> {

	@Override
	public String fromDomainToValue(Ear domain) {
		return domain.getNativeValue();
	}

	@Override
	public Ear fromValueToDomain(String value) {
		return new EAR(value);
	}

}
