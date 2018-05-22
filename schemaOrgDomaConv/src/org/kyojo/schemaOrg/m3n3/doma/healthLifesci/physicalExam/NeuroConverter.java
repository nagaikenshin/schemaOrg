package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.physicalExam.NEURO;
import org.kyojo.schemaOrg.m3n3.healthLifesci.PhysicalExam.Neuro;

@ExternalDomain
public class NeuroConverter implements DomainConverter<Neuro, String> {

	@Override
	public String fromDomainToValue(Neuro domain) {
		return domain.getNativeValue();
	}

	@Override
	public Neuro fromValueToDomain(String value) {
		return new NEURO(value);
	}

}
