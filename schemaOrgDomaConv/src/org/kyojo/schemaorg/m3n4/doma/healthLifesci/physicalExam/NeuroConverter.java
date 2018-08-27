package org.kyojo.schemaorg.m3n4.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.physicalExam.NEURO;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalExam.Neuro;

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
