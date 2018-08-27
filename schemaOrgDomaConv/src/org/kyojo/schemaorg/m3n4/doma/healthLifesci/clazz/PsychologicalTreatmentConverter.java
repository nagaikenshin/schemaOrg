package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PSYCHOLOGICAL_TREATMENT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PsychologicalTreatment;

@ExternalDomain
public class PsychologicalTreatmentConverter implements DomainConverter<PsychologicalTreatment, String> {

	@Override
	public String fromDomainToValue(PsychologicalTreatment domain) {
		return domain.getNativeValue();
	}

	@Override
	public PsychologicalTreatment fromValueToDomain(String value) {
		return new PSYCHOLOGICAL_TREATMENT(value);
	}

}
