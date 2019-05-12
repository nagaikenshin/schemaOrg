package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_TEST_PANEL;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalTestPanel;

@ExternalDomain
public class MedicalTestPanelConverter implements DomainConverter<MedicalTestPanel, String> {

	@Override
	public String fromDomainToValue(MedicalTestPanel domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalTestPanel fromValueToDomain(String value) {
		return new MEDICAL_TEST_PANEL(value);
	}

}
