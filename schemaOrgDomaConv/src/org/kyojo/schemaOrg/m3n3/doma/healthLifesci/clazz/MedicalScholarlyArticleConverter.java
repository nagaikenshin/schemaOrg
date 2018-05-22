package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_SCHOLARLY_ARTICLE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalScholarlyArticle;

@ExternalDomain
public class MedicalScholarlyArticleConverter implements DomainConverter<MedicalScholarlyArticle, String> {

	@Override
	public String fromDomainToValue(MedicalScholarlyArticle domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalScholarlyArticle fromValueToDomain(String value) {
		return new MEDICAL_SCHOLARLY_ARTICLE(value);
	}

}
