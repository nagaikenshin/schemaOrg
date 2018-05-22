package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.TREATMENT_INDICATION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.TreatmentIndication;

@ExternalDomain
public class TreatmentIndicationConverter implements DomainConverter<TreatmentIndication, String> {

	@Override
	public String fromDomainToValue(TreatmentIndication domain) {
		return domain.getNativeValue();
	}

	@Override
	public TreatmentIndication fromValueToDomain(String value) {
		return new TREATMENT_INDICATION(value);
	}

}
