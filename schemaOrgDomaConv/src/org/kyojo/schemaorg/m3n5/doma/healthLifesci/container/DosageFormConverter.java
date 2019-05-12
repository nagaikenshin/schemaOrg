package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DOSAGE_FORM;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.DosageForm;

@ExternalDomain
public class DosageFormConverter implements DomainConverter<DosageForm, String> {

	@Override
	public String fromDomainToValue(DosageForm domain) {
		return domain.getNativeValue();
	}

	@Override
	public DosageForm fromValueToDomain(String value) {
		return new DOSAGE_FORM(value);
	}

}
