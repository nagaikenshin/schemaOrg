package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalObservationalStudyDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalObservationalStudyDesign.CROSS_SECTIONAL;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalObservationalStudyDesign.CrossSectional;

@ExternalDomain
public class CrossSectionalConverter implements DomainConverter<CrossSectional, String> {

	@Override
	public String fromDomainToValue(CrossSectional domain) {
		return domain.getNativeValue();
	}

	@Override
	public CrossSectional fromValueToDomain(String value) {
		return new CROSS_SECTIONAL(value);
	}

}
