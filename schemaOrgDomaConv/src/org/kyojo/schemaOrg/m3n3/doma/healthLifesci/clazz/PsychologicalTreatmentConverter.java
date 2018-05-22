package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PSYCHOLOGICAL_TREATMENT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.PsychologicalTreatment;

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
