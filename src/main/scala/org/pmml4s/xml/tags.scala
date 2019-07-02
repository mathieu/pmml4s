/*
 * Copyright (c) 2017-2019 AutoDeploy AI
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pmml4s.xml

/**
 * Contains all XML tags defined in PMML 4.3 schema.
 */
object ElemTags {
  val PMML = "PMML"
  val EXTENSION = "Extension"
  val HEADER = "Header"
  val APPLICATION = "Application"
  val MINING_BUILD_TASK = "MiningBuildTask"
  val DATA_DICTIONARY = "DataDictionary"
  val DATA_FIELD = "DataField"
  val INTERVAL = "Interval"
  val VALUE = "Value"
  val TRANSFORMATION_DICTIONARY = "TransformationDictionary"
  val MINING_SCHEMA = "MiningSchema"
  val MINING_FIELD = "MiningField"
  val OUTPUT = "Output"
  val OUTPUT_FIELD = "OutputField"
  val DECISIONS = "Decisions"
  val DECISION = "Decision"
  val MODEL_STATS = "ModelStats"
  val MODEL_EXPLANATION = "ModelExplanation"
  val TARGETS = "Targets"
  val TARGET = "Target"
  val TARGET_VALUE = "TargetValue"
  val LOCAL_TRANSFORMATIONS = "LocalTransformations"
  val NODE = "Node"
  val MODEL_VERIFICATION = "ModelVerification"

  val DERIVED_FIELD = "DerivedField"
  val DEFINE_FUNCTION = "DefineFunction"
  val PARAMETER_FIELD = "ParameterField"

  val ASSOCIATION_MODEL = "AssociationModel"
  val BAYESIAN_NETWORK_MODEL = "BayesianNetworkModel"
  val BASELINE_MODEL = "BaselineModel"
  val CLUSTERING_MODEL = "ClusteringModel"
  val GAUSSIAN_PROCESS_MODEL = "GaussianProcessModel"
  val GENERAL_REGRESSION_MODEL = "GeneralRegressionModel"
  val MINING_MODEL = "MiningModel"
  val NAIVE_BAYES_MODEL = "NaiveBayesModel"
  val NEAREST_NEIGHBOR_MODEL = "NearestNeighborModel"
  val NEURAL_NETWORK = "NeuralNetwork"
  val REGRESSION_MODEL = "RegressionModel"
  val RULE_SET_MODEL = "RuleSetModel"
  val SEQUENCE_MODEL = "SequenceModel"
  val SCORECARD = "Scorecard"
  val SUPPORT_VECTOR_MACHINE_MODEL = "SupportVectorMachineModel"
  val TEXT_MODEL = "TextModel"
  val TIME_SERIES_MODEL = "TimeSeriesModel"
  val TREE_MODEL = "TreeModel"
  val REGRESSION = "Regression"
  val DECISION_TREE = "DecisionTree"
  val SEGMENTATION = "Segmentation"
  val SEGMENT = "Segment"

  val SIMPLE_PREDICATE = "SimplePredicate"
  val COMPOUND_PREDICATE = "CompoundPredicate"
  val SIMPLE_SET_PREDICATE = "SimpleSetPredicate"
  val TRUE = "True"
  val FALSE = "False"

  val ARRAY = "Array"
  val INT_SPARSE_ARRAY = "INT-SparseArray"
  val INDICES = "Indices"
  val INT_ENTRIES = "INT-Entries"
  val REAL_ENTRIES = "REAL-Entries"
  val REAL_SPARSE_ARRAY = "REAL-SparseArray"
  val MATRIX = "Matrix"
  val MAT_CELL = "MatCell"
  val PARTITION = "Partition"
  val SCORE_DISTRIBUTION = "ScoreDistribution"

  val REGRESSION_TABLE = "RegressionTable"
  val NUMERIC_PREDICTOR = "NumericPredictor"
  val CATEGORICAL_PREDICTOR = "CategoricalPredictor"
  val PREDICTOR_TERM = "PredictorTerm"

  val CONSTANT = "Constant"
  val FIELD_REF = "FieldRef"
  val NORM_CONTINUOUS = "NormContinuous"
  val LINEAR_NORM = "LinearNorm"
  val NORM_DISCRETE = "NormDiscrete"
  val DISCRETIZE = "Discretize"
  val MAP_VALUES = "MapValues"
  val TEXT_INDEX = "TextIndex"
  val APPLY = "Apply"
  val AGGREGATE = "Aggregate"
  val LAG = "Lag"
  val DISCRETIZE_BIN = "DiscretizeBin"

  val NEURAL_INPUTS = "NeuralInputs"
  val NEURAL_INPUT = "NeuralInput"
  val NEURAL_LAYER = "NeuralLayer"
  val NEURON = "Neuron"
  val CON = "Con"
  val NEURAL_OUTPUTS = "NeuralOutputs"
  val NEURAL_OUTPUT = "NeuralOutput"
  val FIELD_COLUMN_PAIR = "FieldColumnPair"
  val TABLE_LOCATOR = "TableLocator"
  val INLINE_TABLE = "InlineTable"
  val ROW = "row"

  val BAYES_INPUTS = "BayesInputs"
  val BAYES_INPUT = "BayesInput"
  val TARGET_VALUE_STATS = "TargetValueStats"
  val TARGET_VALUE_STAT = "TargetValueStat"
  val BAYES_OUTPUT = "BayesOutput"
  val TARGET_VALUE_COUNTS = "TargetValueCounts"
  val TARGET_VALUE_COUNT = "TargetValueCount"
  val PAIR_COUNTS = "PairCounts"

  val ANY_DISTRIBUTION = "AnyDistribution"
  val GAUSSIAN_DISTRIBUTION = "GaussianDistribution"
  val POISSON_DISTRIBUTION = "PoissonDistribution"
  val UNIFORM_DISTRIBUTION = "UniformDistribution"

  val LINEAR_KERNEL_TYPE = "LinearKernelType"
  val POLYNOMIAL_KERNEL_TYPE = "PolynomialKernelType"
  val RADIAL_BASIS_KERNEL_TYPE = "RadialBasisKernelType"
  val SIGMOID_KERNEL_TYPE = "SigmoidKernelType"
  val VECTOR_DICTIONARY = "VectorDictionary"
  val SUPPORT_VECTOR_MACHINE = "SupportVectorMachine"
  val VECTOR_FIELDS = "VectorFields"
  val VECTOR_INSTANCE = "VectorInstance"
  val SUPPORT_VECTORS = "SupportVectors"
  val COEFFICIENTS = "Coefficients"
  val SUPPORT_VECTOR = "SupportVector"
  val COEFFICIENT = "Coefficient"

  val COMPARISON_MEASURE = "ComparisonMeasure"
  val CLUSTERING_FIELD = "ClusteringField"
  val MISSING_VALUE_WEIGHTS = "MissingValueWeights"
  val CLUSTER = "Cluster"
  val KOHONEN_MAP = "KohonenMap"
  val COVARIANCES = "Covariances"
  val COMPARISONS = "Comparisons"

  val EUCLIDEAN = "euclidean"
  val SQUARED_EUCLIDEAN = "squaredEuclidean"
  val CHEBYCHEV = "chebychev"
  val CITY_BLOCK = "cityBlock"
  val MINKOWSKI = "minkowski"
  val SIMPLE_MATCHING = "simpleMatching"
  val JACCARD = "jaccard"
  val TANIMOTO = "tanimoto"
  val BINARY_SIMILARITY = "binarySimilarity"

  val PARAMETER_LIST = "ParameterList"
  val PARAMETER = "Parameter"
  val FACTOR_LIST = "FactorList"
  val COVARIATE_LIST = "CovariateList"
  val PREDICTOR = "Predictor"
  val CATEGORIES = "Categories"
  val CATEGORY = "Category"
  val PP_MATRIX = "PPMatrix"
  val PP_CELL = "PPCell"
  val P_COV_MATRIX = "PCovMatrix"
  val P_COV_CELL = "PCovCell"
  val PARAM_MATRIX = "ParamMatrix"
  val P_CELL = "PCell"
  val BASE_CUM_HAZARD_TABLES = "BaseCumHazardTables"
  val BASELINE_STRATUM = "BaselineStratum"
  val BASELINE_CELL = "BaselineCell"
  val EVENT_VALUES = "EventValues"

  val ITEM = "Item"
  val ITEMSET = "Itemset"
  val ASSOCIATION_RULE = "AssociationRule"
  val ITEM_REF = "ItemRef"

  val RULE_SET = "RuleSet"
  val RULE_SELECTION_METHOD = "RuleSelectionMethod"
  val COMPOUND_RULE = "CompoundRule"
  val SIMPLE_RULE = "SimpleRule"

  val TRAINING_INSTANCES = "TrainingInstances"
  val KNN_INPUTS = "KNNInputs"
  val KNN_INPUT = "KNNInput"
  val INSTANCE_FIELDS = "InstanceFields"
  val INSTANCE_FIELD = "InstanceField"

  val CHARACTERISTICS = "Characteristics"
  val CHARACTERISTIC = "Characteristic"
  val ATTRIBUTE = "Attribute"
  val COMPLEX_PARTIAL_SCORE = "ComplexPartialScore"

  val TEXT_INDEX_NORMALIZATION = "TextIndexNormalization"
}

object AttrTags {
  val VERSION = "version"
  val NAME = "name"
  val COPYRIGHT = "copyright"
  val DESCRIPTION = "description"
  val MODEL_VERSION = "modelVersion"
  val NUMBER_OF_FIELDS = "numberOfFields"
  val DISPLAY_NAME = "displayName"
  val OPTYPE = "optype"
  val DATA_TYPE = "dataType"
  val VALUE = "value"
  val PROPERTY = "property"
  val CLOSURE = "closure"
  val LEFT_MARGIN = "leftMargin"
  val RIGHT_MARGIN = "rightMargin"
  val MODEL_NAME = "modelName"
  val FUNCTION_NAME = "functionName"
  val ALGORITHM_NAME = "algorithmName"
  val IS_SCORABLE = "isScorable"

  val MISSING_VALUE_STRATEGY = "missingValueStrategy"
  val MISSING_VALUE_PENALTY = "missingValuePenalty"
  val NO_TRUE_CHILD_STRATEGY = "noTrueChildStrategy"
  val SPLIT_CHARACTERISTIC = "splitCharacteristic"

  val MODEL_TYPE = "modelType"
  val TARGET_FIELD_NAME = "targetFieldName"
  val NORMALIZATION_METHOD = "normalizationMethod"

  val USAGE_TYPE = "usageType"
  val IMPORTANCE = "importance"
  val OUTLIERS = "outliers"
  val LOW_VALUE = "lowValue"
  val HIGH_VALUE = "highValue"
  val MISSING_VALUE_REPLACEMENT = "missingValueReplacement"
  val MISSING_VALUE_TREATMENT = "missingValueTreatment"
  val INVALID_VALUE_TREATMENT = "invalidValueTreatment"

  val TARGET_FIELD = "targetField"
  val FEATURE = "feature"
  val RULE_FEATURE = "ruleFeature"
  val ALGORITHM = "algorithm"
  val RANK = "rank"
  val RANK_BASIS = "rankBasis"
  val RANK_ORDER = "rankOrder"
  val IS_MULTI_VALUED = "isMultiValued"
  val SEGMENT_ID = "segmentId"
  val IS_FINAL_RESULT = "isFinalResult"

  val FIELD = "field"
  val CAST_INTEGER = "castInteger"
  val MIN = "min"
  val MAX = "max"
  val RESCALE_CONSTANT = "rescaleConstant"
  val RESCALE_FACTOR = "rescaleFactor"
  val DISPLAY_VALUE = "displayValue"
  val PRIOR_PROBABILITY = "priorProbability"
  val DEFAULT_VALUE = "defaultValue"

  val OPERATOR = "operator"
  val BOOLEAN_OPERATOR = "booleanOperator"

  val N = "n"
  val TYPE = "type"
  val NB_ROWS = "nbRows"
  val NB_COLS = "nbCols"
  val DIAG_DEFAULT = "diagDefault"
  val OFF_DIAG_DEFAULT = "offDiagDefault"
  val ROW = "row"
  val COL = "col"

  val ID = "id"
  val SCORE = "score"
  val RECORD_COUNT = "recordCount"
  val DEFAULT_CHILD = "defaultChild"
  val CONFIDENCE = "confidence"
  val PROBABILITY = "probability"

  val EXPONENT = "exponent"
  val COEFFICIENT = "coefficient"
  val INTERCEPT = "intercept"
  val TARGET_CATEGORY = "targetCategory"
  val ALTERNATE_TARGET_CATEGORY = "alternateTargetCategory"

  val MAP_MISSING_TO = "mapMissingTo"
  val MULTIPLE_MODEL_METHOD = "multipleModelMethod"

  val BUSINESS_PROBLEM = "businessProblem"
  val ACTIVATION_FUNCTION = "activationFunction"
  val THRESHOLD = "threshold"
  val WIDTH = "width"
  val ALTITUDE = "altitude"
  val NUMBER_OF_LAYERS = "numberOfLayers"
  val NUMBER_OF_INPUTS = "numberOfInputs"
  val NUMBER_OF_NEURONS = "numberOfNeurons"
  val NUMBER_OF_OUTPUTS = "numberOfOutputs"

  val ORIG = "orig"
  val NORM = "norm"
  val BIN_VALUE = "binValue"
  val OUTPUT_COLUMN = "outputColumn"
  val COLUMN = "column"
  val FROM = "from"
  val WEIGHT = "weight"
  val BIAS = "bias"
  val OUTPUT_NEURON = "outputNeuron"
  val FIELD_NAME = "fieldName"
  val COUNT = "count"

  val MEAN = "mean"
  val VARIANCE = "variance"
  val LOWER = "lower"
  val UPPER = "upper"

  val SVM_REPRESENTATION = "svmRepresentation"
  val CLASSIFICATION_METHOD = "classificationMethod"
  val MAX_WINS = "maxWins"

  val GAMMA = "gamma"
  val COEF0 = "coef0"
  val DEGREE = "degree"
  val NUMBER_OF_VECTORS = "numberOfVectors"
  val NUMBER_OF_SUPPORT_VECTORS = "numberOfSupportVectors"
  val NUMBER_OF_ATTRIBUTES = "numberOfAttributes"
  val VECTOR_ID = "vectorId"
  val NUMBER_OF_COEFFICIENTS = "numberOfCoefficients"
  val ABSOLUTE_VALUE = "absoluteValue"

  val MODEL_CLASS = "modelClass"
  val NUMBER_OF_CLUSTERS = "numberOfClusters"
  val KIND = "kind"
  val COMPARE_FUNCTION = "compareFunction"
  val MINIMUM = "minimum"
  val MAXIMUM = "maximum"
  val P_PARAMETER = "p-parameter"
  val C00_PARAMETER = "c00-parameter"
  val C10_PARAMETER = "c10-parameter"
  val C01_PARAMETER = "c01-parameter"
  val C11_PARAMETER = "c11-parameter"
  val D00_PARAMETER = "d00-parameter"
  val D01_PARAMETER = "d01-parameter"
  val D10_PARAMETER = "d10-parameter"
  val D11_PARAMETER = "d11-parameter"
  val SIZE = "size"
  val COORD1 = "coord1"
  val COORD2 = "coord2"
  val COORD3 = "coord3"
  val IS_CENTER_FIELD = "isCenterField"
  val FIELD_WEIGHT = "fieldWeight"
  val SIMILARITY_SCALE = "similarityScale"

  val TARGET_VARIABLE_NAME = "targetVariableName"
  val TARGET_REFERENCE_CATEGORY = "targetReferenceCategory"
  val CUMULATIVE_LINK = "cumulativeLink"
  val LINK_FUNCTION = "linkFunction"
  val LINK_PARAMETER = "linkParameter"
  val TRIALS_VARIABLE = "trialsVariable"
  val TRIALS_VALUE = "trialsValue"
  val DISTRIBUTION = "distribution"
  val DIST_PARAMETER = "distParameter"
  val OFFSET_VARIABLE = "offsetVariable"
  val OFFSET_VALUE = "offsetValue"
  val MODEL_DF = "modelDF"
  val END_TIME_VARIABLE = "endTimeVariable"
  val START_TIME_VARIABLE = "startTimeVariable"
  val SUBJECT_ID_VARIABLE = "subjectIDVariable"
  val STATUS_VARIABLE = "statusVariable"
  val BASELINE_STRATA_VARIABLE = "baselineStrataVariable"
  val LABEL = "label"
  val REFERENCE_POINT = "referencePoint"
  val CONTRAST_MATRIX_TYPE = "contrastMatrixType"
  val PREDICTOR_NAME = "predictorName"
  val PARAMETER_NAME = "parameterName"
  val P_ROW = "pRow"
  val P_COL = "pCol"
  val T_ROW = "tRow"
  val T_COL = "tCol"
  val BETA = "beta"
  val DF = "df"
  val MAX_TIME = "maxTime"
  val TIME = "time"
  val CUM_HAZARD = "cumHazard"

  val FUNCTION = "function"

  val CATEGORY = "category"
  val MAPPED_VALUE = "mappedValue"
  val SUPPORT = "support"
  val ITEM_REF = "itemRef"
  val ANTECEDENT = "antecedent"
  val CONSEQUENT = "consequent"
  val LIFT = "lift"
  val LEVERAGE = "leverage"
  val AFFINITY = "affinity"
  val NUMBER_OF_TRANSACTIONS = "numberOfTransactions"
  val MAX_NUMBER_OF_ITEMS_PER_TA = "maxNumberOfItemsPerTA"
  val AVG_NUMBER_OF_ITEMS_PER_TA = "avgNumberOfItemsPerTA"
  val MINIMUM_SUPPORT = "minimumSupport"
  val MINIMUM_CONFIDENCE = "minimumConfidence"
  val LENGTH_LIMIT = "lengthLimit"
  val NUMBER_OF_ITEMS = "numberOfItems"
  val NUMBER_OF_ITEMSETS = "numberOfItemsets"
  val NUMBER_OF_RULES = "numberOfRules"

  val NB_CORRECT = "nbCorrect"
  val DEFAULT_SCORE = "defaultScore"
  val DEFAULT_CONFIDENCE = "defaultConfidence"
  val CRITERION = "criterion"

  val NUMBER_OF_NEIGHBORS = "numberOfNeighbors"
  val CONTINUOUS_SCORING_METHOD = "continuousScoringMethod"
  val CATEGORICAL_SCORING_METHOD = "categoricalScoringMethod"
  val INSTANCE_ID_VARIABLE = "instanceIdVariable"
  val IS_TRANSFORMED = "isTransformed"
  val FIELD_COUNT = "fieldCount"

  val INITIAL_SCORE = "initialScore"
  val USE_REASON_CODES = "useReasonCodes"
  val REASON_CODE_ALGORITHM = "reasonCodeAlgorithm"
  val BASELINE_SCORE = "baselineScore"
  val BASELINE_METHOD = "baselineMethod"
  val REASON_CODE = "reasonCode"
  val PARTIAL_SCORE = "partialScore"

  val TEXT_FIELD = "textField"
  val LOCAL_TERM_WEIGHTS = "localTermWeights"
  val IS_CASE_SENSITIVE = "isCaseSensitive"
  val MAX_LEVENSHTEIN_DISTANCE = "maxLevenshteinDistance"
  val COUNT_HITS = "countHits"
  val WORD_SEPARATOR_CHARACTER_RE = "wordSeparatorCharacterRE"
  val TOKENIZE = "tokenize"

  val IN_FIELD = "inField"
  val OUT_FIELD = "outField"
  val REGEX_FIELD = "regexField"
  val RECURSIVE = "recursive"
}

object ValTags {
  val CATEGORICAL = "categorical"
  val ORDINAL = "ordinal"
  val CONTINUOUS = "continuous"

  val STRING = "string"
  val INTEGER = "integer"
  val FLOAT = "float"
  val DOUBLE = "double"
  val BOOLEAN = "boolean"
  val DATE = "date"
  val TIME = "time"
  val DATETIME = "dateTime"
  val `DATEDAYSSINCE[0]` = "dateDaysSince[0]"
  val `DATEDAYSSINCE[1960]` = "dateDaysSince[1960]"
  val `DATEDAYSSINCE[1970]` = "dateDaysSince[1970]"
  val `DATEDAYSSINCE[1980]` = "dateDaysSince[1980]"
  val TIMESECONDS = "timeSeconds"
  val `DATETIMESECONDSSINCE[0]` = "dateTimeSecondsSince[0]"
  val `DATETIMESECONDSSINCE[1960]` = "dateTimeSecondsSince[1960]"
  val `DATETIMESECONDSSINCE[1970]` = "dateTimeSecondsSince[1970]"
  val `DATETIMESECONDSSINCE[1980]` = "dateTimeSecondsSince[1980]"

  val ACTIVE = "active"
  val PREDICTED = "predicted"
  val TARGET = "target"
  val SUPPLEMENTARY = "supplementary"
  val GROUP = "group"
  val ORDER = "order"
  val FREQUENCYWEIGHT = "frequencyWeight"
  val ANALYSISWEIGHT = "analysisWeight"

  val VALID = "valid"
  val INVALID = "invalid"
  val MISSING = "missing"

  val INT = "int"
  val REAL = "real"
}