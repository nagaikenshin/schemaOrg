package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.TREATMENT_INDICATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.TreatmentIndication;

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
